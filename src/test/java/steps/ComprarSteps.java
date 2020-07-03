package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.*;

public class ComprarSteps {

    private ClicarProduto clicarProduto = new ClicarProduto();
    private ColocarNoCarrinho colocarNoCarrinho = new ColocarNoCarrinho();
    private ConfirmarCarrinho confirmarCarrinho = new ConfirmarCarrinho();
    private CriarConta criarConta = new CriarConta();
    private CadastrarDados cadastrarDados = new CadastrarDados();
    private ConfirmarEndereco confirmarEndereco = new ConfirmarEndereco();
    private AceitarTermos aceitarTermos = new AceitarTermos();
    private FormaDePagamento formaDePagamento = new FormaDePagamento();
    private ConfirmarPagamento confirmarPagamento = new ConfirmarPagamento();

    @Dado("eu acesso a url {string}")
    public void euAcessoAUrl(String url) {
        clicarProduto.acessarUrl(url);

    }

    @Quando("eu escolher um produto")
    public void euEscolherUmProduto() {
        clicarProduto.escolherProduto();
    }

    @E("sera colocado no carrinho")
    public void seraColocadoNoCarrinho() {
        colocarNoCarrinho.colocarNoCarrinho();
    }

    @E("vou confirmar que esta no carrinho")
    public void vouConfirmarQueEstaNoCarrinho() {
        confirmarCarrinho.confirmaCarrinho();
    }

    @E("vou criar uma conta")
    public void vouCriarUmaConta() {
        criarConta.informarEmail();
    }

    @E("vou cadastrar meus dados")
    public void vouCadastrarMeusDados() {
        cadastrarDados.preencherDados();
    }

    @E("vou confirmar meu endereco")
    public void vouConfirmarMeuEndereco() {
        confirmarEndereco.confirmarEndereco();
    }

    @E("vou aceitar os termos")
    public void vouAceitarOsTermos() {
        aceitarTermos.aceitaTermos();
    }

    @E("escolher a forma de pagamento")
    public void escolherAFormaDePagamento() {
        formaDePagamento.formadePagamento();
    }

    @Entao("vou confirmar o pagamento")
    public void vouConfirmarOPagamento() {
        confirmarPagamento.confirmarPagamento();
    }
}
