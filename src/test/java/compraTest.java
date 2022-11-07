import compra.Compra;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pagamento.ModalParcelado;
import pagamento.ModalRotativo;
import pagamento.Pagamento;

import java.time.LocalDateTime;
import java.util.Date;

public class compraTest {
    @Test
    public void realizarCompraParceladaEm3Vezes(){
        // aqui o usuario faz uma compra onde o valor bruto é de R$560,80
        // e ele verifica se é possivel parcelar em até 3 vezes a compra
        Compra compra = new Compra();
        compra.setIdCompra(1);
        compra.setValorBruto(560.80);
        compra.setDiaCompra(new Date(2022-11-5));
        compra.setComprador(compra.getComprador());
        compra.setVendedor(compra.getVendedor());
        ModalParcelado parcelado = new ModalParcelado();
        parcelado.setQuantidadeMaxParcelas(compra.getValorBruto());
        Assertions.assertTrue(parcelado.getQuantidadeMaxParcelas() == 3);
    }
    @Test
    public void calculandoJurosNoRotativo(){
        // adiciono o valor de 123.50 no valor bruto da compra, seleciono a opção
        // de pagamento no rotativo e é gerado o juros da modalidade
        // depois eu faço um assertEquals aguardando o valor adcional do juros
        //para comparar os valores, eu somei o metodo Calcular taxa paga com o meu valor bruto
        Compra compra = Mockito.mock(Compra.class);
        Pagamento pagamento = new Pagamento();
        Mockito.when(compra.getValorBruto()).thenReturn(123.50);
        ModalRotativo pagRotativo = new ModalRotativo();
        System.out.println("Juros de " + pagRotativo.getTaxaOperacao());
        Assertions.assertEquals(125.95765, pagamento.calcularTaxaPaga(compra.getValorBruto(), pagRotativo.getTaxaOperacao()) + compra.getValorBruto());
    }
    @Test
    public void parcelandoComprasEm1Vez(){
        // verificando em quantas vezes é possivel parcelar o valor da compra
        // e depois é verificado com o assert false, se a compra for dividida em mais
        // de 1 vez, significa que o codigo está errado
        Compra compra = Mockito.mock(Compra.class);
        Mockito.when(compra.getValorBruto()).thenReturn(50.0);
        ModalParcelado parcelado = new ModalParcelado();
        parcelado.setQuantidadeMaxParcelas(compra.getValorBruto());
        Assertions.assertFalse(parcelado.getQuantidadeMaxParcelas() != 1);
        Mockito.verify(compra).getValorBruto();
    }
    @Test
    public void calcularValorDasParcelas(){
        // dado um valor, é feito o teste onde é calculado o valor de cada parcela.
        Compra compra = Mockito.mock(Compra.class);
        Mockito.when(compra.getValorBruto()).thenReturn(900.0);
        ModalParcelado parcelado = new ModalParcelado();
        Assertions.assertEquals(300, parcelado.calcularValorParcelas(compra.getValorBruto(), 3));
        Mockito.verify(compra).getValorBruto();
    }
    @Test
    public void taxaAdicionalParaParcelamentoAcimaDe3Vezes(){
        // calculo da taxa adicional para compras com parcelamento acima de 3 vezes
        // que é o valor maximo permitido
        Compra compra = Mockito.mock(Compra.class);
        Mockito.when(compra.getValorBruto()).thenReturn(600.0);
        ModalParcelado parcelado = new ModalParcelado();
        parcelado.setQuantidadeParcelas(8);
        parcelado.setTaxaTotal(parcelado.getQuantidadeParcelas());
        Assertions.assertEquals(600.2891, parcelado.getTaxaTotal() + compra.getValorBruto());
    }

}
