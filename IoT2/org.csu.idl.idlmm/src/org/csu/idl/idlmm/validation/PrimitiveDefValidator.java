/**
 *
 * $Id$
 */
package org.csu.idl.idlmm.validation;

import org.csu.idl.idlmm.PrimitiveKind;

/**
 * A sample validator interface for {@link org.csu.idl.idlmm.PrimitiveDef}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PrimitiveDefValidator {
	boolean validate();

	boolean validateKind(PrimitiveKind value);
}
