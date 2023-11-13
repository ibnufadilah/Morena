package AP;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class InputTagihan {
    @Test
    @DisplayName("Login Negatif")
    public void LoginNegatif() {
        Playwright playwright = Playwright.create();
        BrowserType.LaunchOptions setHeadless = new BrowserType.LaunchOptions().setHeadless(false);
        Browser browser = playwright.chromium().launch(setHeadless);
        Page page = browser.newPage();


        //navigate to application
        page.navigate("https://morenasys.demo.pkp.co.id/");
        page.locator("//body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/input[1]").fill("1037");
        page.locator("//body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[3]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/input[1]").fill("12345");
        page.locator("//body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[3]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/button[1]").click();
        assertThat(page.getByText("User atau password salah")).isVisible();
    }

    @Test
    @DisplayName("Input Tagihan")
    public void InputTagihan() {
        Playwright playwright = Playwright.create();
        BrowserType.LaunchOptions setHeadless = new BrowserType.LaunchOptions().setHeadless(false);
        Browser browser = playwright.chromium().launch(setHeadless);
        Page page = browser.newPage();
        page.navigate("https://morenasys.demo.pkp.co.id/");
        page.locator("//body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/" +
                "tr[1]/td[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/input[1]").fill("1037");
        page.locator("//body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/" +
                "tr[1]/td[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[3]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/input[1]").fill("123");
        page.locator("//body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/" +
                "tr[1]/td[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[3]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/button[1]").click();
        assertThat(page.getByText("Nuri Agustina")).isVisible();
        //klik menu finance staff
        page.locator("//body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/" +
                "div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/" +
                "table[1]/tbody[1]/tr[2]/td[1]/div[1]").click();
        //klik sub menu arus kas
        page.locator("//body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/" +
                "div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/" +
                "tbody[1]/tr[1]/td[1]/div[1]/span[1]/i[1]").click();
        //klik sub menu pengeluaran
        page.locator("//body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/" +
                "div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/" +
                "table[1]/tbody[1]/tr[3]/td[1]/div[1]/span[2]/i[1]").click();
        //klik submenu tagihan
        page.locator("//body[1]/div[1]/div[2]/div[1]/div[1]/" +
                "div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/" +
                "div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/div[1]/span[3]/i[1]").click();
        //klik menu input tagihan
        page.locator("//body[1]/div[1]/div[2]/div[1]/" +
                "div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/" +
                "div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[1]/div[1]/span[5]").click();
        assertThat(page.getByText("Input Tagihan")).isVisible();
        //button new input tagihan
        page.locator("//body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/" +
                "div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/" +
                "table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/" +
                "table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[5]/button[1]").click();
        //cari tipe transaksi AP
        page.locator("//body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/" +
                "div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/" +
                "div[3]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/span[1]/a[1]/i[1]").click();
        //cari ap opex
        page.locator("//body[1]/div[2]/div[1]/table[1]/" +
                "tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/" +
                "div[1]/div[3]/table[1]/tbody[1]/tr[5]/td[1]/div[1]").click();
        //cari list kontak
        page.locator("//body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]" +
                "/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/" +
                "div[3]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/span[1]/a[1]/i[1]").click();
//        page.locator("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/" +
//                "table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/input[1]").fill("PT DANA ELEKTRONIK");
//        page.keyboard().press("Enter");
//        page.locator("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/" +
//                "tbody[1]/tr[3]/td[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]").click();
        //pilih kontak yang dituju
        page.locator("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/" +
                "td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]").click();

        //input keterangan input tagihan
        page.locator("//body[1]/div[1]/div[2]/div[1]/div[1]/" +
                "div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/" +
                "div[1]/div[3]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[5]/td[8]/textarea[1]").fill("Test input AP");
        //klik button tambah transaksi
        page.locator("//body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/" +
                "div[1]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/th[1]/div[1]/button[1]").click();
        //klik button cari detail transaksi
        page.locator("//body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/" +
                "div[1]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/" +
                "tr[1]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/a[1]").click();
        //input tipe transaksi
        page.locator("//body[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/" +
                "tr[1]/th[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]").fill("Biaya Bahan Lain");
        page.keyboard().press("Enter");
        //klik atau pilih tipe transaksi yang dicari tadi
        page.locator("//body[1]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]").click();
        //input nominal transaksi
        page.locator("//body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]" +
                "/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/input[1]").fill("1000000");
        //klik button save
        page.locator("//body[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[2]").click();
        //pilih yes validasi apakah kamu ingin simpan
        page.locator("//body[1]/div[4]/div[2]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/button[1]").click();

        assertThat(page.getByText("Data Saved...")).isVisible();

        Path screenshotPath = Paths.get(System.currentTimeMillis() + ".jpg");
        page.screenshot(new Page.ScreenshotOptions().setPath(screenshotPath));


    }
}
