function slackify(text) {
  var output = "";
  for(var i = 0; i < text.length; i++) {
    if (text.toLowerCase().charAt(i) == " ") {
      output += "  "
    } else {
      output += ":alphabet-white-" + text.toLowerCase().charAt(i) + ": ";
    }
  }

  return output;
}

