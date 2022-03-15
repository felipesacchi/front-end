#language: pt
  @Login
  Funcionalidade: para testar login

    Esquema do Cenario: : Checar se o login foi sucesso
      Dado usuario esta na pagina de login
      Quando o usuario entra com <username> e <password>
      E clica no botao de login
      Entao verifico botao logout
      Exemplos:
      | username    | password |
      | test1       | 12345    |
      | test2       | 12345    |

    Cenario: Validar texto de senha invalida
      Dado usuario esta na pagina de login
      Quando o usuario entra com test1 e senha
      E clica no botao de login
      Entao a mensagem "Password is invalid" sera exibida