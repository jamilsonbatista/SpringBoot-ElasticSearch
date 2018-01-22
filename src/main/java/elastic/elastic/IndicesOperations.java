package elastic.elastic;

import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsResponse;
import org.elasticsearch.client.Client;
import org.springframework.stereotype.Component;

/**
 * @author  mali.sahin on 22.01.2018.
 */
@Component
public class IndicesOperations {

    private final Client client;

    public IndicesOperations(Client client) {
        this.client = client;
    }

    public  boolean checkIndexExists(String name) {
        IndicesExistsResponse response = client.admin().indices().prepareExists(name).execute().actionGet();
        return  response.isExists();
    }

    public  void createIndex(String name) {
        client.admin().indices().prepareCreate(name).execute().actionGet();
    }

    public void deleteIndex(String name) {
        client.admin().indices().prepareDelete(name).execute().actionGet();
    }

    public void closeIndex(String name) {
        client.admin().indices().prepareClose(name).execute().actionGet();
    }

    public void  openIndex(String name){
        client.admin().indices().prepareOpen(name).execute().actionGet();
    }

}
