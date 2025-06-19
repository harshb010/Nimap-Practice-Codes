
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TagService {


    List<Product> product;
    List<Tags> tags;


    public TagService(List<Product> product, List<Tags> tags) {
        this.product = product;
        this.tags = tags;

    }

    public void addTag(int productId, List<Integer> tagIds) {

        for (Product p : product) {
        if (p.getId() == productId) {
            List<Tags> matchTags = new ArrayList<>();
            for (Integer tagId : tagIds) {
                for (Tags t : tags) {
                    if (t.getId() == tagId && !matchTags.contains(t)) {
                        matchTags.add(t);
                    }
                }
            }
            p.setListTags(matchTags);

        }
    }


    }



}


