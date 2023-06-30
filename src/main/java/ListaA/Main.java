package ListaA;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Pais pais = new Pais("BRA","Brasil",new BigDecimal("8515767.049"));
        pais.setPopulacao(193946886);
        pais.setFronteiras("Argentina");
        pais.setFronteiras("Uruguai");
        pais.setFronteiras("Paraguai");
        pais.setFronteiras("Bolívia");
        pais.setFronteiras("Peru");
        pais.setFronteiras("Colômbia");
        pais.setFronteiras("Venezuela");
        pais.setFronteiras("Suriname");
        pais.setFronteiras("Guiana");

        System.out.println("Nome: " + pais.getNome());
        System.out.println("ISO: " + pais.getCodigoIso());
        System.out.println("População: " + pais.getPopulacao());
        System.out.println("Dimensão: " + pais.getExtensaoKm2() + " km²");
        System.out.println("Densidade populacional: " + pais.densidadePopulacional() + " habitantes por km²");

        System.out.println("Peru é vizinho? " + pais.eVizinho("peru"));
        System.out.println("Japão é vizinho? " + pais.eVizinho("Japão"));

    }
}
