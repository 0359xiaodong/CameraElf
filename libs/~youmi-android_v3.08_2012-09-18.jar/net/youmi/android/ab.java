// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.view.View;

// Referenced classes of package net.youmi.android:
//			aa, dz

class ab
	implements android.view.View.OnClickListener
{

	final aa a;

	ab(aa aa1)
	{
		a = aa1;
		super();
	}

	public void onClick(View view)
	{
		try
		{
			if (a.b != null)
				a.b.c();
		}
		catch (Exception exception) { }
	}
}
