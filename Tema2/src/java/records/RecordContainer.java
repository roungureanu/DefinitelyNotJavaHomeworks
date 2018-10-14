package records;

import java.util.HashMap;
import java.util.Map;
import records.exceptions.DuplicateKeyException;

/**
 *
 * @author LucianAlexandru
 */
public class RecordContainer {
    
    Map<String, RecordBean> records;
    
    public RecordContainer() {
        records = new HashMap<String, RecordBean>();
    }
    
    public void addRecord(RecordBean record) 
        throws DuplicateKeyException {
        
        if (records.containsKey(record.key))
            throw new DuplicateKeyException("Key " + record.key + " already exists!");
        
        records.put(record.key, record);
        
    }
    
}
