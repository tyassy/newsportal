package locators;

import org.openqa.selenium.By;

public interface RegisterPageLocator {

  By BUTTON_SAVE_REGISTER = By.cssSelector("button[data-qa-id='btn-save']");
  By INPUT_EMAIL = By.cssSelector("input[data-qa-id='input-email']");
  By VERIFICATION_POPUP = By.xpath("//div[@data-qa-id='content']//span[(text()='Link verifikasi sudah dikirim ke email kamu. Yuk langsung buka email dan klik link verifikasinya agar akun kamu aktif.')]");
}
