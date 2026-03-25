package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a gene and a disease it predisposes an organism to.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class GeneIsGeneticBasisForDisease extends Association<Gene, String, Disease> {


}