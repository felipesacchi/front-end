package stepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.objects.LoginPage;

public class LoginSteps {



    @Dado("usuario esta na pagina de login")
    public void usuarioEstaNaPaginaDeLogin() {
        ;
    }

    @Quando("o usuario entra com {} e {}")
    public void oUsuarioEntraComUsernameEPassword(String username, String password) {

        LoginPage.action().fillUsername(username);
        LoginPage.action().fillPassword(password);

    }

    @E("clica no botao de login")
    public void clicaNoBotaoDeLogin() {
        LoginPage.action().clickBtnLogin();

    }

    @Entao("verifico botao logout")
    public void verificoBotaoLogout() {
        LoginPage.action().btnLogoutDisplayed();

    }

    @Entao("a mensagem {string} sera exibida")
    public void aMensagemSeraExibida(String passwordInvalid) {
        Assert.assertEquals(passwordInvalid, LoginPage.action().txtPasswordInvalid());
    }
}
