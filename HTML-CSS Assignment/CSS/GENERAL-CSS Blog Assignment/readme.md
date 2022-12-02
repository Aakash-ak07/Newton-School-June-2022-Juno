<!-- CSS Blog Assignment -->
In this question we are going to add some styles to the body and the
navbar. The result of this task is shown in the image below.
Add the following styles :
 part-1
Add the background color "rgb(230, 230, 230)" to the body
Add the following styles to the ul tag
Remove the bullet points from all the "li's"
set the margin and padding to "0px"
Set the background color as "rgb(1, 14, 128)"
Set the display to "flex" and flex-direction to "row"

  part-2
Add the following styles :
For the li tags present inside the nav tag set "flex-grow" property to "1"
Add the hover pseudo-class to the li tags which sets their backgorund-color property to "rgba(0, 0, 0, 0)"
Set the text-align property of the h1 tag to center

  part-3
Add the following styles :
For all the "a" tags present inside the li tag add the following styles:
Set the display property to "block"
Set the color property to "rgb(255, 255, 255)"
Set the text-align property to "center"
Set the padding to "30px"
Remove the line under the text that is present inside the "a" tag

  part-4
Add the following styles :
For the article tag add the following styles:
Set the "text-align" property to left
Add a margin of "15px"
Set the "max-width" property to "100%"
Set the font size to "18px"
Set the line height to "32px"

  part-5
Add the following styles :
For the article tag add the following styles:
Add the following styles to the figure tag
Set the "display" property to "flex"
Set the flex direction to center
Center it across the cross axis

Add the following styles to the figcaption tag
Center the text

Add the following styles to the img tag
Give it a width and height of "400px" and "300px"

  part-6
Add the following styles :
For the aside tag add the following styles:
Set the "left" property to "10px"
Set the padding to "15px"
Set the "max-width" to "100%"
Set the position to "relative"
Set the border to "5px solid rgb(1, 14, 128)"
Set the font size to "18px"
Center the h2 tag's text

  part-7
Add the following styles :
For the video tag add the following styles:
Set the display to "block"
Set width and height to "420px" and "250px" respectively
Set the padding to "15px"
For the audio tag add the following styles:
Set the padding to "15px"
Set max-width of "90%"
  
  
<!--html part -->
<!-- only html full part blog -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>India</title>
</head>

<body>
  <nav>
    <ul>
      <li> <a href="#Blog">Blog</a> </li>
      <li> <a href="#Media">Media</a> </li>
      <li> <a href="#Contact-Me">Contact Me</a> </li>
      <li> <a href="#About">About</a> </li>
    </ul>  
  </nav> 

  <header>
    <h1> India</h1>
  </header>  
  <main>

    <section id="Blog">
      <article>
        <p id="blog-content">
          India is one of the oldest civilizations in the world with a kaleidoscopic variety and rich cultural heritage. It has achieved all-round socio-economic progress during the last 65 years of its Independence. India has become self-sufficient in agricultural production and is now one of the top industrialized countries in the world and one of the few nations to have gone into outer space to conquer nature for the benefit of the people. It covers an area of 32, 87,263 sq. km, extending from the snow-covered Himalayan heights to the tropical rain forests of the south. As the 7th largest country in the world, India stands apart from the rest of Asia, marked off as it is by mountains and the sea, which give the country a distinct geographical entity. Bounded by the Great Himalayas in the north, it stretches southwards and at the Tropic of Cancer, tapers off into the Indian Ocean between the Bay of Bengal on the east and the Arabian Sea on the west. As you travel, India offers a range of vast tourism choices, diverse in land and nature, people, tribes, cuisine, faiths, dance forms, music, arts, crafts, adventure, sport, spirituality, history; even these vary as you journey from one state to another. As a country, India has achieved all-round socio-economic progress in the last 70 years of independence. The change is clearly visible in the Tier I and Tier II cities. However, the fascinating aspect lies in the stark difference as you travel through the new and old parts of its cities. From world-class airports and hotels, luxurious shopping malls, restaurants, pubs and cafes to overcrowded streets and alleyways, in the same cities, filled with thousands of little shops offering every possible modern and ethnic product and native street food is a fascinating experience.
        </p>  
      </article>  
    </section> 
    
    <figure>
      <img src="https://d3dyfaf3iutrxo.cloudfront.net/general/upload/967c2ad2aeb341ecba3edb91fe56d7e7.jpg"/>
      <figcaption>
        Indian Flag
      </figcaption>  
    </figure>  

    <aside>
      <p> India is very popular for the variety of great food it has. Some of the top food items in NYC include:</p> 
      <ol>
        <li>Palak paneer</li>
        <li>Chicken tikka masala</li>
        <li>Fish curry</li>
        <li>Dal makhani</li>
        <li>Biryani</li>
        <li>Kofta</li>
        <li>Chana masala</li>
      </ol>   
    </aside>
    
    <section id="media">
      <article>
        <h2>The Map of India</h2>
        <p>India is officially known as the Republic of India. It comprises of a total of 28 states along with eight union territories. India is the second most populated country in the world and the world’s largest democracy. The country’s coastline measures 7,517 kilometres in length, out of which 5,423 kilometres belong to peninsular India, and 2,094 kilometres belong to Andaman, Nicobar and Lakshadweep island chains. Additionally, the Indian naval hydrographic charts along with mainland coastline include 43% of sandy beaches, 36% of mudflats, marshy shores of 10% and rocky shores of 11%..</p>
      </article> 
      <video src="https://d3dyfaf3iutrxo.cloudfront.net/general/upload/60555de88e1b46ae91e333bf12d51f18.mp4" controls>
      </video>   
      <embed src="https://d3dyfaf3iutrxo.cloudfront.net/general/upload/0f97a4a619b74e80a9708d35df0781c5.jpg">
      <h2>Indian National Anthem</h2>
      <audio src="https://d3dyfaf3iutrxo.cloudfront.net/general/upload/c3d9722a72ce4e98a472dc60b42e301a.mp3" controls>
    </section>  
  </main>  
  
  <form  id="contact-me">
    <div >
      <h1>Get in touch!</h1>
        <select id="select" required>
          <option selected disabled>-- Please choose an option --</option>
          <option>Request Quote</option>
          <option>Send Resume</option>
          <option>Other</option>      
        </select>
    
        <div  >
          <input type="text" placeholder="Name" required id="name">  
          <input type="text" placeholder="Surname" required id="surname">
        </div>
    
        <div >
          <input type="email" placeholder="Email" required id="email">  
          <input type="tel" placeholder="Phone" required id="phone">
        </div>
    
        <textarea placeholder="Message" required id="message"></textarea>
    
        <div >
          
          <button type="submit" id="button">
            <span >SUBMIT</span>
          </button>
        </div>
    </div>
  </form>

  <footer id="about">
    <p id="name">Posted By: Aakash</p>
    <p id="contact">Contact information: Aakash@xyz.com</p>
  </footer> 
  
</body>
</html>
  
 
