import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class WordPuzzle {
  public static void main(String[] args) {
      staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    // staticFileLocation("/public");

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/output.vtl");
      String userInput = request.queryParams("userInput");
      WordPuzzle newWordPuzzle = new WordPuzzle();
      String output = newWordPuzzle.replaceVowel(userInput);
      model.put("output", output);

      // NEEDS TO LINK RESULTS PAGE!^^^^^

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String replaceVowel(String word) {

    String userWord = word;
    // replaceAll("AaEeIiOoUu", "-");
    // equals();
      userWord = userWord.replace("a","-");
      userWord = userWord.replace("A", "-");
      userWord = userWord.replace("E", "-");
      userWord = userWord.replace("e", "-");
      userWord = userWord.replace("I", "-");
      userWord = userWord.replace("i", "-");
      userWord = userWord.replace("O", "-");
      userWord = userWord.replace("o", "-");
      userWord = userWord.replace("U", "-");
      userWord = userWord.replace("u", "-");

    return userWord;
}
}
