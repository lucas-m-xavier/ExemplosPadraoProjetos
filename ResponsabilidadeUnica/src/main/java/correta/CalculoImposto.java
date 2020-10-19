/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correta;

/**
 *
 * @author Lucas
 */
public class CalculoImposto {
    public void calcularIRRF(Funcionario funcionario, double aliquota) {
        funcionario.setSalarioLiquido(funcionario.getSalarioBruto() - (funcionario.getSalarioBruto() * aliquota));
    }
}
