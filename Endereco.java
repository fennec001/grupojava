public class Endereco {
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String cep;
    private String telefone;
    
    
    
    public Endereco(String estado, String cidade, String bairro, String rua, String cep, String telefone) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.telefone = telefone;
    }
    public Endereco() {
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        String str = "";
        str += "rua: " + rua + ", cep: " + cep + ", telefone: " + telefone + "bairro" + bairro + ", cidade: " + cidade + ", estado: " + estado;
        return str;
    }
}
