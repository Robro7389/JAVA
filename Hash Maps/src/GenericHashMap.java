import java.util.ArrayList;
import java.util.LinkedList;

public class GenericHashMap<K,V> {
    private ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float lf = 0.5f;

    public GenericHashMap(){
        list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key,V value){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities){
            if (entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }

        if ((float)(size / list.size()) > lf){
            reHash();
        }

        entities.add(new Entity(key, value));
        size++;
    }

    public void reHash(){
        System.out.println("We are now rehashing!");
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> entities : old){
            for (Entity entity : entities){
                put(entity.key,entity.value);
            }
        }
    }

    public V get(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities){
            if (entity.key.equals(key)){
                return entity.value;
            }
        }

        return null;
    }

    public V remove(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        Entity target = null;

        for (Entity entity : entities){
            if (entity.key.equals(key)){
                target = entity;
                entities.remove(entity);
                break;
            }
        }

        size--;
        assert target != null;  //If target is null , it will throw an exception.
        return target.value;
    }

    public class Entity{
        K key;
        V value;
        public Entity(K key,V value){
            this.key = key;
            this.value = value;
        }
    }
}
