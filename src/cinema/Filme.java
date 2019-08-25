
package cinema;


public class Filme {
    private String genero;
    private String classIndicativa;
    private String titulo;
    private String duraçao;
      

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setGenero(String genero){
       this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }
    public void setDuraçao(String duraçao){
        this.duraçao = duraçao;
    }
    public String getDuraçao(){
        return duraçao;
    }
    public void setClassIndicativa(String classIndicativa){
        this.classIndicativa = classIndicativa;
    }
    public String getClassIndicativa(){
        return classIndicativa;
    }
    
    
   
}
