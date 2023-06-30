package ListaA;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Pais {
    private String codigoIso;
    private String nome;
    private long populacao;
    private BigDecimal extensaoKm2;
    private ArrayList<String> fronteiras;

    public Pais(String codigoIso, String nome, BigDecimal extensaoKm2) {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.extensaoKm2 = extensaoKm2;
        this.fronteiras = new ArrayList<>();
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public BigDecimal getExtensaoKm2() {
        return extensaoKm2;
    }

    public void setExtensaoKm2(BigDecimal extensaoKm2) {
        this.extensaoKm2 = extensaoKm2;
    }

    public ArrayList<String> getFronteiras() {
        return fronteiras;
    }

    public void setFronteiras(ArrayList<String> fronteiras) {
        this.fronteiras = fronteiras;
    }
    public void setFronteiras(String vizinho) {
        fronteiras.add(vizinho);
    }

    public boolean eVizinho(Pais pais){
        for (String p : this.fronteiras){
            if (p.equalsIgnoreCase(pais.nome)){
                return true;
            }
        }
        return false;
    }

    public boolean eVizinho(String pais){
        for (String p : this.fronteiras){
            if (p.equalsIgnoreCase(pais)){
                return true;
            }
        }
        return false;
    }

    public BigDecimal densidadePopulacional(){
        return BigDecimal.valueOf(populacao).divide(extensaoKm2, BigDecimal.ROUND_HALF_DOWN);
    }

    public ArrayList<String> retornaVizinhosEmComum(Pais pais){
        ArrayList<String> vizinhosEmComum = new ArrayList<>();
        for (String p : fronteiras){
            if (pais.fronteiras.contains(p)){
                vizinhosEmComum.add(p);
            }
        }
        return vizinhosEmComum;
    }
}
