package dao;

import static dao.DaoMestre.factory;
import static dao.DaoMestre.transaction;
import model.DestinoVoo;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class DestinoVooDao extends DaoMestre {

    public static DestinoVooDao destinoDao = null;

    public static DestinoVooDao getInstance() {
        if (destinoDao == null) {
            destinoDao = new DestinoVooDao();
        }
        return destinoDao;
    }
        
    public static DestinoVoo pegarDestinoId(Integer viagemId) {
        DestinoVoo destinoVoo = new DestinoVoo();
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Query byIdQuery = sessao.createQuery("FROM destvoo as m WHERE m.viagem.id = :viagem_id");
            byIdQuery.setParameter("viagem_id", viagemId);
            destinoVoo = (DestinoVoo) byIdQuery.uniqueResult();

        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return destinoVoo;
    }
    /*
     public static List<DestinoVoo> pegarTodosDestinos(JComboBox jcbDestino int destinoId) {
        List<DestinoVoo> lista = null;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            lista = sessao.createQuery("from destvoo ORDER BY id").list();
            for (DestinoVoo destino : lista) {
                jcbDestino.addItem(destino.getAeroporto().getEndereco().getCidade().getNome());
            }
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }
*/
}
