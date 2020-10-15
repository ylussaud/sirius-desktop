/*******************************************************************************
 * Copyright (c) 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.diagram.sequence.business.internal.util;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.sequence.business.internal.elements.AbstractFrame;
import org.eclipse.sirius.diagram.sequence.business.internal.elements.ISequenceEvent;
import org.eclipse.sirius.diagram.sequence.business.internal.elements.Lifeline;
import org.eclipse.sirius.diagram.sequence.business.internal.elements.Message;
import org.eclipse.sirius.diagram.sequence.util.Range;

/**
 * Sequence cache helper.
 * 
 * @author nlepine
 * 
 */
public final class CacheHelper {

    private static boolean dragTrackercacheEnabled;

    private static Map<AbstractFrame, Collection<Lifeline>> coverageCache = new ConcurrentHashMap<>();

    private static ConcurrentHashMap<ISequenceEvent, Collection<ISequenceEvent>> subEventsCache = new ConcurrentHashMap<>();

    private static ConcurrentHashMap<View, Range> viewToRangeCache = new ConcurrentHashMap<>();

    private static ConcurrentHashMap<ISequenceEvent, Message> startCompoundMessageCache = new ConcurrentHashMap<>();

    private static ConcurrentHashMap<ISequenceEvent, Message> endCompoundMessageCache = new ConcurrentHashMap<>();

    /**
     * Avoid instantiation.
     */
    private CacheHelper() {
        // Do nothing.
    }

    /**
     * Return if drag tracker cache is enabled.
     * 
     * @return if drag tracker cache is enabled.
     */
    public static boolean isDragTrackerCacheEnabled() {
        return dragTrackercacheEnabled;
    }

    /**
     * Set if drag tracker cache is enabled.
     * 
     * @param enabled
     *            boolean
     */
    public static void setDragTrackerCacheEnabled(boolean enabled) {
        CacheHelper.dragTrackercacheEnabled = enabled;
    }

    /**
     * Clear drag tracker caches.
     */
    public static void clearDragTrackerCaches() {
        coverageCache.clear();
        subEventsCache.clear();
        viewToRangeCache.clear();
        startCompoundMessageCache.clear();
        endCompoundMessageCache.clear();
    }

    /**
     * Clear and disable all caches.
     */
    public static void clearCaches() {
        CacheHelper.setDragTrackerCacheEnabled(false);
        CacheHelper.clearDragTrackerCaches();
    }

    /**
     * Init and enable all caches.
     */
    public static void initCaches() {
        clearCaches();
        CacheHelper.setDragTrackerCacheEnabled(true);
    }

    /**
     * Get AbstractFrame.coveredCache.
     * 
     * @return Map<AbstractFrame, Collection<Lifeline>>
     */
    public static Map<AbstractFrame, Collection<Lifeline>> getCoverageCache() {
        return coverageCache;
    }

    /**
     * get subEvents cache.
     * 
     * @return the subEventsCache
     */
    public static ConcurrentHashMap<ISequenceEvent, Collection<ISequenceEvent>> getSubEventsCache() {
        return subEventsCache;
    }

    /**
     * Get view to range cache.
     * 
     * @return the viewToRangecache
     */
    public static Map<View, Range> getViewToRangeCache() {
        return viewToRangeCache;
    }

    /**
     * get start message cache.
     * 
     * @return the message
     */
    public static ConcurrentHashMap<ISequenceEvent, Message> getStartCompoundMessageCache() {
        return startCompoundMessageCache;
    }

    /**
     * get end message cache.
     * 
     * @return the message
     */
    public static ConcurrentHashMap<ISequenceEvent, Message> getEndCompoundMessageCache() {
        return endCompoundMessageCache;
    }
}