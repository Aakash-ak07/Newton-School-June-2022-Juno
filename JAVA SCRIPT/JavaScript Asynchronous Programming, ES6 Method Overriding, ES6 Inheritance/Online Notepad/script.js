// javascript code goes here
const textarea = document.getElementById("textarea");
const featureflag = document.getElementById("feature-flag");

featureflag.addEventListener('change', () => {
    localStorage.setItem('autosave-data', textarea.value);
});
