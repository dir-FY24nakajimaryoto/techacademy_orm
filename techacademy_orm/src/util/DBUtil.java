package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * DAO役割クラス
 * - 接続関連はHibernateに任せる
 */
public class DBUtil {
    
    private static final String PERSISTENCE_UNIT_NAME = "techacademy_orm";
    private static EntityManagerFactory emf;
    
    //　新しいアプリケーション管理のEntityManagerを作成
    public static EntityManager createEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }

    // EMFactoryがなかったらPersistence.xmlの「一般」タブにある名前を参照して作る
    private static EntityManagerFactory getEntityManagerFactory() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return emf;
    }
    
}
