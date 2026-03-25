package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a gene and some alteration to its nucleic acid sequence.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class GeneHasQualityMutation extends Association<Gene, String, Mutation> {


}