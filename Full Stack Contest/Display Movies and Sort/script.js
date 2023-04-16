let dataArray = []
let sort = document.getElementById("sort")
let movies  = document.getElementById("movies");

sort.addEventListener('change',()=>{
    console.log("calaed", sort.value)
    display(sort.value)
})

async function getData(){
    let response = await fetch
    ("https://api.themoviedb.org/3/movie/top_rated?api_key=f1a87d30ad8792e0dd1c12ce07d37337&language=en-US&page=1");
    let data = await response.json()
    return data
}

getData().then((data)=>{
    dataArray = [...data.results]
    display("asc")
}).catch((err)=>{
    console.log("err", err); 
})


function display(casee){
    
    if(casee =="asc"){
        dataArray.sort((a,b)=>+a.release_date.split("-")[0]- +b.release_date.split("-")[0])
    }else{
        dataArray.sort((a,b)=> b.release_date.split("-")[0]-a.release_date.split("-")[0])

    }
    movies.innerHTML = ""
    dataArray.forEach((e)=>{
        let card = document.createElement("div");
        card.className = "movie";
        let image = document.createElement("img")
        image.className="poster"
        image.src = `https://image.tmdb.org/t/p/w500${e.poster_path}`
        image.alt = "movie-title"
        card.append(image)
        let newDiv =document.createElement("div")
        let h2 = document.createElement("h2");
        h2.className = "movie-title"
        h2.innerHTML = e.original_title
        newDiv.append(h2)
        let p1 = document.createElement("p")
        p1.className = "release-year"
        p1.innerHTML= (e.release_date).split("-")[0];
        newDiv.append(p1);
        let p2 = document.createElement("p");
        p2.className = "movie-overview"
        p2.innerHTML = e.overview
        newDiv.append(p2);
        card.append(newDiv)
        movies.append(card)
    })
}
