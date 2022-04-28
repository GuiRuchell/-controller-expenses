package br.com.despesa;

import br.com.despesa.dao.DespesaDAO;
import br.com.despesa.model.Despesa;

import java.util.List;

public class ListarDespesas {

    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        List<Despesa> despesas = dao.findAll();

        for (Despesa despesa : despesas) {
            System.out.println("ID " + despesa.getId());
            System.out.println("Descrição " + despesa.getDescricao());
            System.out.println("Valor " + despesa.getValor());

        }
    }
}
