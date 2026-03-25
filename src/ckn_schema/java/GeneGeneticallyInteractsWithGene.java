package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a gene and a second gene that it modifies the activity of.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class GeneGeneticallyInteractsWithGene extends Association<Gene, String, Gene> {


}