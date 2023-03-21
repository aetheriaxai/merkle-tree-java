package org.cardanofoundation.merkle;

import com.bloxbean.cardano.client.plutus.annotation.Constr;
import lombok.AllArgsConstructor;

@Constr
@AllArgsConstructor
public class MerkleEmpty implements MerkleElement {

    public final static MerkleEmpty EMPTY = new MerkleEmpty();

}