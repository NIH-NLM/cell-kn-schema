package gov.nih.nlm.ckn;

import java.util.List;
import lombok.*;

/**
  A relationship between a biomarker combination and a set of binary genes that its members are a member of.
**/
@Data
@EqualsAndHashCode(callSuper=false)
public class BiomarkerCombinationSubclusterOfBinaryGeneSet extends Association<BiomarkerCombination, String, BinaryGeneSet> {


}