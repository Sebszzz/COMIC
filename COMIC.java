let popupShown = false;

function showPopup() {
  document.getElementById("popup1").style.display = "block";
  popupShown = true;
}

function chooseOption(option) {
  if (option === "option1") {
    alert("You chose option 1");
  } else if (option === "option2") {
    alert("You chose option 2");
  }
  document.getElementById("popup1").style.display = "none";
}

window.addEventListener("scroll", function () {
  if (window.pageYOffset > 500 && !popupShown) {
    showPopup();
  }
});
