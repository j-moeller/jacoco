/*******************************************************************************
 * Copyright (c) 2009, 2022 Mountainminds GmbH & Co. KG and Contributors
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Marc R. Hoffmann - initial API and implementation
 *
 *******************************************************************************/

/*
 * todo fix license:
 * SPDX-License-Identifier: EPL-2.0 and Apache-2.0
 * These patches apply to JaCoCo (https://github.com/jacoco/jacoco) and are hereby made available under the terms of the
 * Eclipse Public License 2.0 available at:
 *  http://www.eclipse.org/legal/epl-2.0
 */

package org.jacoco.core.internal.instr;

import org.objectweb.asm.MethodVisitor;

public interface IProbeInserterFactory {
	ProbeInserter makeProbeInserter(int access, String name, String desc,
			MethodVisitor mv, IProbeArrayStrategy arrayStrategy);
}
