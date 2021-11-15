/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ActividadObligatoraJavaUnidad2;
    import javax.swing.JOptionPane;
/**
 *
 * @author Micaela
 */
public class ActividadObligatoraJavaUnidad2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre=JOptionPane.showInputDialog("ingrese Nombre:");
        String apellido=JOptionPane.showInputDialog("ingrese Apellido:");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("ingrese Edad:"));
        String hobbie=JOptionPane.showInputDialog("ingrese Hobbie:");
        String editorDeCodigo=JOptionPane.showInputDialog("ingrese Editor de Codigo Preferido:");
        String sistemaOperativo=JOptionPane.showInputDialog("ingrese Sistema Operativo que Utiliza:");
        System.out.println("Nombre: "+(nombre));
        System.out.println("Apellido: "+(apellido));
        System.out.println("Edad: "+(edad));
        System.out.println("Hobbie: "+(hobbie));
        System.out.println("Editor de Codigo Preferido: "+(editorDeCodigo));
        System.out.println("Sistema Operativo que Utiliza: "+(sistemaOperativo));
    }
    
}
