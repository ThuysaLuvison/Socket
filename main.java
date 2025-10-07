import javax.swing.*;
import java.io.*;
import java.net.*;  

public class main {
    public static void main(String[] args) {
        JEditorPane editorPagina = new JEditorPane();
       
        JFrame frame = new JFrame("Pagina Carregada");// Cria a janela com título

        JScrollPane scrollPane = new JScrollPane(editorPagina);// Adiciona o editor dentro de uma barra de rolagem

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Define o comportamento de fechamento da janela

        frame.getContentPane().add(scrollPane);// Adiciona o conteúdo ao frame

        frame.setSize(1920, 1080);// Define o tamanho da janela

        frame.setVisible(true);// Torna a janela visível

        try{
editorPagina.setPage(new URL (JOptionPane.showInputDialog("Insira a URL que deseja abrir"))); // Pede ao usuário uma URL e carrega no editor
        }catch (MalformedURLException e) {
            System.err.println("Problema com o formato da URL:" + e.getMessage());   
        }catch (IOException e) {
            System.err.println("Problemas de IO: Não foi possivel carregar a pagina:"+ e.getMessage());
        }
    }
}