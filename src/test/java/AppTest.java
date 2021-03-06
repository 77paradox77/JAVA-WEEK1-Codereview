import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("This program was created in Java for the Week1 Epicodus Java Challenge");
  }
  @Test
  public void outPut() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("Puzzling Words");
    submit(".btn");
    assertThat(pageSource()).contains("P-zzl-ng W-rds");
  }

  @Test
  public void layOut() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Word Puzzle");
  }
}
