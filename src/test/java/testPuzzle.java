import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class testPuzzle extends FluentTest{ 
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
 public WebDriver getDefaultDriver() {
   return webDriver;
 }



 @Test
   public void replaceVowel_replacesVowelAwithDash_vowelsToDashes(){
     WordPuzzle replaceAllVowels = new WordPuzzle();
      assertEquals("-",replaceAllVowels.replaceVowel("a"));
   }

  @Test
    public void replaceVowel_replacesVowelawithDash_vowelsToDashes() {
      WordPuzzle replaceAllVowels = new WordPuzzle();
      assertEquals("-",replaceAllVowels.replaceVowel("A"));
    }

  @Test
    public void replaceVowel_replacesVowelEwithDash_vowelsToDashes() {
      WordPuzzle replaceAllVowels = new WordPuzzle();
      assertEquals("-", replaceAllVowels.replaceVowel("E"));
      assertEquals("-", replaceAllVowels.replaceVowel("e"));
    }

    @Test
      public void replaceVowel_replacesVowelIwithDash_vowelsToDashes() {
        WordPuzzle replaceAllVowels = new WordPuzzle();
        assertEquals("-", replaceAllVowels.replaceVowel("I"));
        assertEquals("-", replaceAllVowels.replaceVowel("i"));
      }

    @Test
        public void replaceVowel_replacesVowelOwithDash_vowelsToDashes() {
          WordPuzzle replaceAllVowels = new WordPuzzle();
          assertEquals("-", replaceAllVowels.replaceVowel("O"));
            assertEquals("-", replaceAllVowels.replaceVowel("o"));
        }
    @Test
      public void replaceVowel_replacesVowelUwithDash_vowelsToDashes() {
        WordPuzzle replaceAllVowels = new WordPuzzle();
        assertEquals("-", replaceAllVowels.replaceVowel("U"));
        assertEquals("-", replaceAllVowels.replaceVowel("u"));
      }
 }
