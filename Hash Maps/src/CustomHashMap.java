
import java.util.ArrayList;

public class CustomHashMap {
    private Entity[] entities;

    public CustomHashMap(){
        entities = new Entity[100];
    }

    public class Entity{
        String key;
        String value;

        public Entity(String key,String value){
            this.key = key;
            this.value = value;
        }

    }

    public void put(String key,String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }

        return null;
    }

    public String remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        String removed = null;
        if (entities[hash] != null && entities[hash].key.equals(key)){
            removed = entities[hash].value;
            entities[hash] = null;
        }

        return removed;
    }

    public String getOrDefault(String key,String defaulter){
        int hash = Math.abs(key.hashCode() % entities.length);
        if (entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        else {
            return defaulter;
        }
    }
}
