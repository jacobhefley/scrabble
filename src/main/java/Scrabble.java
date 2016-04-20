import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import spark.ModelAndView;
import static java.lang.System.out;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class Scrabble {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String sentence = request.queryParams("sentence");
      Integer totalValue = calculateScore(sentence);

      model.put("totalValue", totalValue);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static Integer calculateScore(String sentence) {
    String temp = sentence;
    int size = temp.length();
    Integer total = 0;
    char[] charArray = temp.toCharArray();
    for(int i=0; i<size; i++){
      switch (charArray[i]){
        case 'a':
          total++;
          break;
        case 'e':
          total++;
          break;
        case 'i':
          total++;
          break;
        case 'o':
          total++;
          break;
        case 'u':
          total++;
          break;
        case 'l':
          total++;
          break;
        case 'n':
          total++;
          break;
        case 'r':
          total++;
          break;
        case 's':
          total++;
          break;
        case 't':
          total++;
          break;
        case 'd':
          total += 2;
          break;
        case 'g':
          total += 2;
          break;
        case 'b':
          total += 3;
          break;
        case 'c':
          total += 3;
          break;
        case 'p':
          total += 3;
          break;
        case 'm':
          total += 3;
          break;
        case 'f':
          total += 4;
          break;
        case 'h':
          total += 4;
          break;
        case 'v':
          total += 4;
          break;
        case 'w':
          total += 4;
          break;
        case 'y':
          total += 4;
          break;
        case 'k':
          total += 5;
          break;
        case 'j':
          total += 8;
          break;
        case 'x':
          total += 8;
          break;
        case 'q':
          total += 10;
          break;
        case 'z':
          total += 10;
          break;
        default:
          break;
      }
    }
    // sentence = temp.toString();
    return total;
  }
  // public static String specialStripper(String x){
  //   String returnValue = x.toLowerCase();
  //   return returnValue.replaceAll("\\P{L}", "");
  // }
}
