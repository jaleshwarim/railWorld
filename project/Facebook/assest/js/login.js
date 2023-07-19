const form=document.querySelector("form")



form.addEventListener("submit", (e)=>{
    e.preventDefault()

    const email= form.email.value
    const password=form.password.value

    const authenticated =authentication(email,password)

    if(authenticated){
        // alert("correct")
        window.location.href ="index.html"
    }
    else{
        alert("wrong")
    }
})

//function for checking username and password

function authentication(email,password){
    if(email === "railworld@gmail.com" && password ==="1234"){
        return true
    }
    else
    {
        return false
    }
}