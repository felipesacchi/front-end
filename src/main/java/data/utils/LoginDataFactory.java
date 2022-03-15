package data.utils;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Locale;

import static data.utils.GeraCpfCnpj.*;

public class LoginDataFactory {

    private static String unRegisteredPswd = "senhaNaoCadastrada@123";

    private LoginDataFactory() {
    }

    private static Faker faker = new Faker(new Locale("pt-BR"));

    public static String unRegisteredCpf() {
        return cpf(false);
    }

    public static String unRegisteredBirthDate() {
        return new SimpleDateFormat("dd-MM-yyyy").format(faker.date().birthday(16, 60));
    }

    public static String getUnRegisteredPassword() {
        return unRegisteredPswd;
    }

    @Test
    public void test(){
        System.out.println(rg(true));
        System.out.println(cpf(true));
        System.out.println(cnpj(true));
    }
}
