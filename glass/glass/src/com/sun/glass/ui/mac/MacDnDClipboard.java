/*
 * Copyright (c) 2010, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.sun.glass.ui.mac;

import com.sun.glass.events.MouseEvent;

final class MacDnDClipboard extends MacSystemClipboard {

    public MacDnDClipboard(String name) {
        super(name);
    }

    /*
     * called from native
     */
    static MacDnDClipboard getInstance() {
        return (MacDnDClipboard)get(DND);
    }

    @Override public String toString() {
        return "Mac DnD Clipboard";
    }

    /*
     * The MouseEvent.BUTTON_XXXX const if Java is DnD source.
     */
    protected int dragButton = 0;

    public int getDragButton() {
        return dragButton;
    }

    /*
     * Called from native code
     */
    private void setDragButton(int dragButton) {
        this.dragButton = dragButton;
    }
}