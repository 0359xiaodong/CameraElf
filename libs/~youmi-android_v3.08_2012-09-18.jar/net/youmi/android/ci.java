// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package net.youmi.android;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;

// Referenced classes of package net.youmi.android:
//			ao, cj, ck, cl

class ci extends AsyncTask
{

	Context a;

	ci(Context context)
	{
		a = context;
	}

	protected transient cl a(Void avoid[])
	{
		return ao.a(a);
		Exception exception;
		exception;
		return null;
	}

	protected void a(cl cl1)
	{
		super.onPostExecute(cl1);
		if (cl1 == null)
			return;
		try
		{
			if (cl1.e == null)
				if (cl1.b == null)
					cl1.e = "�Ƿ���µ����°汾?";
				else
					cl1.e = (new StringBuilder("�Ƿ񽫰汾���µ����µ�")).append(cl1.b).append("?").toString();
			(new android.app.AlertDialog.Builder(a)).setTitle("Ӧ�ó������°汾����").setMessage(cl1.e).setCancelable(false).setNegativeButton("�Ժ���˵", new cj(this)).setPositiveButton("��������", new ck(this, cl1)).create().show();
		}
		catch (Exception exception) { }
	}

	protected void onPostExecute(Object obj)
	{
		a((cl)obj);
	}

	protected transient Object doInBackground(Object aobj[])
	{
		return a((Void[])aobj);
	}
}
