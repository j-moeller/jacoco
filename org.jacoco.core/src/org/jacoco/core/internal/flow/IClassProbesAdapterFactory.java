package org.jacoco.core.internal.flow;

public interface IClassProbesAdapterFactory {
    ClassProbesAdapter makeClassProbesAdapter(ClassProbesVisitor cv,
                                              boolean trackFrames);
}