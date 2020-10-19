/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incorreta;

/**
 *
 * @author Lucas
 */
public class Funcionario {
    private final double salarioBruto;
    private double salarioLiquido;

    public Funcionario(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public void calcularIRRF(double aliquota) {
        this.salarioLiquido = this.salarioBruto - (this.salarioBruto * aliquota);
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }   
}
