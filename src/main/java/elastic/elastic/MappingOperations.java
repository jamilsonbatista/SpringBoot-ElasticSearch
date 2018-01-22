package elastic.elastic;

import org.elasticsearch.action.admin.indices.mapping.put.PutMappingResponse;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;

/**
 * @author: mali.sahin on 22.01.2018.
 */

public class MappingOperations {

    @Autowired
    IndicesOperations indices;

    XContentBuilder builder = null;

    //Client client = NativeClient
    public void prepareMapping() {
        try {
            builder = jsonBuilder().
                    startObject().field("type1").
                    startObject().field("properties").
                    startObject().field("nested1").
                    startObject().field("type").
                    value("nested").
                    endObject().
                    endObject().
                    endObject().
                    endObject();

            PutMappingResponse response = null;
        } catch (Exception e) {

        }
    }
}
