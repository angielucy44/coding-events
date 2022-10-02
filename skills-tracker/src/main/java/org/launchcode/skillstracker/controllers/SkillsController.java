package org.launchcode.skillstracker.controllers;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public String languages() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>Java</ol>" +
                "<ol>Python>" +
                "<ol>JavaScript</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String languagesForm() {
        return "<html>" +
                "<body>" +
                "<form action='form' method='post'>" +
                "<label for='name-input'>Your Name:</label>" +
                "<input type='text' name='name' id='name-input'>" +
                "<br>" +
                "<label for='firstLanguage-select'>Favorite Language: </label>" +
                "<br>" +
                "<select name='firstLanguage' id='firstLanguage-select'>" +
                "<option value=''>--Choose a language--</option>" +
                "<option value = 'java'>Java</option>" +
                "<option value = 'python'>Python</option>" +
                "<option value = 'javaScript'>JavaScript</option>" +
                "</select>" +
                "<br>" +
                "<label for='secondLanguage-select'>Second Favorite Language: </label>" +
                "<br>" +
                "<select name='secondLanguage' id='secondLanguage-select'>" +
                "<option value=''>--Choose a language--</option>" +
                "<option value = 'java'>Java</option>" +
                "<option value = 'python'>Python</option>" +
                "<option value = 'javaScript'>JavaScript</option>" +
                "</select>" +
                "<br>" +
                "<label for='thirdLanguage-select'>Third Favorite Language: </label>" +
                "<br>" +
                "<select name='thirdLanguage' id='thirdLanguage-select'>" +
                "<option value=''>--Choose a language--</option>" +
                "<option value = 'java'>Java</option>" +
                "<option value = 'python'>Python</option>" +
                "<option value = 'javaScript'>JavaScript</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String languagesParam(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        if (name==null) {
            name = "hello";
        }
        String results =
                "<html" +
                        "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                        "<li> " + firstLanguage + "</li>" +
                        "<li> " + secondLanguage + "</li>" +
                        "<li> " + thirdLanguage + "</li>" +
                        "/ol>" +
                        "</body>" +
                        "</html>";
        return results;
    }

}