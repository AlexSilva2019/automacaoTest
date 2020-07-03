# language: pt
# charset: UTF-8

Funcionalidade: Comprar
  Eu como cliente gostaria de realizar uma compra com sucesso

  Cenario: Executar login com credenciais validas
    Dado eu acesso a url "http://automationpractice.com/index.php"
    Quando eu escolher um produto
    E sera colocado no carrinho
    E vou confirmar que esta no carrinho
    E vou criar uma conta
    E vou cadastrar meus dados
    E vou confirmar meu endereco
    E vou aceitar os termos
    E escolher a forma de pagamento
    Entao vou confirmar o pagamento