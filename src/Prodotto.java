public class Prodotto {
    
private String nome;
private String modello;
private String marca;
private double prezzo;

public Prodotto(String n, String mo, String ma, double p){
this.nome=n;
this.modello=mo;
this.marca=ma;
this.prezzo=p;
}

public String getNome() {
    return nome;
}
public String getModello() {
    return modello;
}
public String getMarca() {
    return marca;
}
public double getPrezzo() {
    return prezzo;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setModello(String modello) {
    this.modello = modello;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public void setPrezzo(double prezzo) {
    this.prezzo = prezzo;
}

@Override
public String toString(){

    return "Prodotto: " + nome + ", " + marca+ ", "+ modello + ", "+ prezzo + "in euro";
}


}