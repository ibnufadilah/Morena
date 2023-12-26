package asset;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.nio.file.Paths;

public class master_tipe {
    @Test
    @DisplayName("Created Master Tipe")
    public void master_tipe (){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(500));
        BrowserContext newContext = browser.newContext(
                new Browser.NewContextOptions().setRecordVideoDir(Paths.get("Videos/")).setRecordVideoSize(1280, 720));
        Page page = newContext.newPage();
        page.navigate("https://morenasys.demo.pkp.co.id/mainlogin.zul");
        page.locator("//body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/" +
                "tr[1]/td[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/input[1]").fill("1017");
        page.locator("//body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/" +
                "tr[1]/td[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[3]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/input[1]").fill("12345678");
        page.locator("//body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/" +
                "tr[1]/td[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[3]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/button[1]").click();

        ElementHandle nama_akun = page.waitForSelector("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[9]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]");
        if (nama_akun != null){
            System.out.println("Kamu berhasil login");
        } else {
            System.out.println("Kamu gagal login");
        }

        ElementHandle Funding = page.waitForSelector("//div[contains(@class, 'z-listcell-content') and text()='FUNDING SUPERVISOR']");
        Funding.click();

        ElementHandle operationalElement = page.waitForSelector("//span[contains(text(),'OPERATIONAL')]");
        operationalElement.click();

        ElementHandle AssetElement = page.waitForSelector("//span[contains(text(),'ASSET')]");
        AssetElement.click();

        ElementHandle setupkategoripengadaan = page.waitForSelector("//body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/span[4]");
        setupkategoripengadaan.click();

        ElementHandle menusetupkategoripengadaan = page.waitForSelector("//span[contains(text(), 'Setup Kategori Pengadaan')]");
        if (setupkategoripengadaan != null){
            System.out.println("Kamu masuk ke menu setup kategori pengadaan");
        } else {
            System.out.println("Kamu gagal masuk ke menu setup kategori pengadaan");
        }

        ElementHandle buttonNew = page.waitForSelector("//button[contains(text(), 'New')]");
        buttonNew.click();
        page.locator("//body[1]/div[3]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/input[1]").fill("Tank");
        page.locator("//body[1]/div[3]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/input[1]").fill("Tank");
        page.locator("//body[1]/div[3]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]").fill("20");
        page.locator("//body[1]/div[3]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[6]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]").fill("10");
        page.locator("//body[1]/div[3]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[7]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]").fill("5");
        page.locator("//body[1]/div[3]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[8]/td[2]/div[1]/div[1]/span[1]/input[1]").fill("20-Dec-2023");
        page.locator("//body[1]/div[3]/div[2]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]/img[1]").click();
        ElementHandle validasiOK = page.waitForSelector("//button[contains(@class, 'z-messagebox-button') and contains(@class, 'z-button')]");
        validasiOK.click();

        ElementHandle buttonFind = page.waitForSelector("//body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[3]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]");
        buttonFind.click();
        ElementHandle buttonYesFind = page.waitForSelector("//button[contains(@class, 'z-messagebox-button') and contains(text(), 'Yes')]");
        buttonYesFind.click();


        String newCategory = page.textContent("//div[contains(@class, 'z-listcell-content') and contains(text(), 'Tank')]"); // Ganti dengan locator untuk data yang ditambahkan

        if (newCategory.contains("Tank")) {
            System.out.println("Data kategori berhasil ditambahkan!");
        } else {
            System.out.println("Data kategori tidak ditemukan atau tidak sesuai.");
        }








        page.close();
        browser.close();
        playwright.close();
    }
}
