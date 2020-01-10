package am.globbing.pages.header;

public class HeaderPageXpaths {
  
    public static final String LANGUAGE_SWITCHER_XPATH = "//form[@class='language--form f_languageForm']/div[@class='field--select f_field--select']";
	public static final String ENGLISH_SWITCHER_XPATH = "//li[@class='eng ']/label[@class='language--label flag--eng' and @for='language_2']";
	public static final String RUSSIAN_SWITCHER_XPATH = "//li[@class='rus ']/label[@class='language--label flag--rus' and @for='language_6']";
	public static final String REGISTER_BTN = "//a[contains(@class,'-up')]";
	public static final String LOGIN_BTN = "//span[@class='signInBtn']";
	public static final String RUS_LOGIN_BTN = "//a[contains(@href,'rus/login')]";
}
