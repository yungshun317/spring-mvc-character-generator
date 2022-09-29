package yungshun.chang.springmvccharactergenerator;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/characterGenerator")
public class CharacterGeneratorController {

    /* Need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "character-generator-form";
    }
     */

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model model) {

        // Create a character generator object
        CharacterGenerator characterGenerator = new CharacterGenerator();

        // Add character generator object to the model
        model.addAttribute("character", characterGenerator);

        return "character-generator-form";
    }

    /* Need a controller method to process the HTML form. You will go to `/processForm?name=INPUT` after input.
    @RequestMapping("/processForm")
    public String processForm() {
        return "Hello world";
    }
     */

    /* Need a controller method to read form data and add data to the model
    @RequestMapping("/processForm")
    public String generateCharacter(HttpServletRequest request, Model model) {

        // Read the request parameter from the HTML form
        String name = request.getParameter("name");

        // Create the message
        String message = "Hello, " + name + "!";

        // Add message to the model
        model.addAttribute("message", message);

        return "character-generator";
    }
     */

    /* No longer need `String name = request.getParameter("name");`
    @RequestMapping("/processForm")
    public String generateCharacter(@RequestParam("name") String name, Model model) {
        // Create the message
        String message = "Hello, " + name + "!";

        // Add message to the model
        model.addAttribute("message", message);

        return "character-generator";
    }
     */

    @RequestMapping("/processForm")
    public String generateCharacter(@Valid @ModelAttribute("character") CharacterGenerator characterGenerator, BindingResult bindingResult) {

        // Log the input data
        System.out.println("character: " + characterGenerator.getFirstName() + " " + characterGenerator.getLastName());

        if (bindingResult.hasErrors()) {
            return "character-generator-form";
        } else {
            return "character-generator";
        }
    }
}
