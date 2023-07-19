const reels = document.querySelector("reels-btn");
const stories = document.getElementById("stories-btn");

reels.addEventListener("click", showIt);
stories.addEventListener("click", hideIt);

function showIt(){
    document.getElementById("reels").style.display = "block";
}
function hideIt(){
    document.getElementById("reels").style.display = "none";

}

// if(stories.addEventListener("click", showIt)){
//     document.getElementById("reels").style.display = "block";
// }
//  else if(stories.addEventListener("click", showIt)){
//     document.getElementById("reels").style.display = "block";
// }
// else{
//     document.getElementById("reels").style.display = "none";
// }
// reels.addEventListener("click" ,()=>{
//     window.location.replace("login.html")
// })