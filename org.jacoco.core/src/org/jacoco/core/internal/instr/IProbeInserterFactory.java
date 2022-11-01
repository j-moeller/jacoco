package org.jacoco.core.internal.instr;

import org.objectweb.asm.MethodVisitor;

public interface IProbeInserterFactory {
    ProbeInserter makeProbeInserter(int access, String name, String desc,
                                    MethodVisitor mv, IProbeArrayStrategy arrayStrategy);
}