"use client"
import { validaEmailC } from '@/functions/adapter/clientecomDesignPartner';
import { emailValidacaoAdapter } from '@/functions/adapter/validacao/emailValidacaoAdapter';
import Image from 'next/image'
import { useState } from 'react';

export default function Home() {
  const [email, setEmail] = useState<string>();

  const handleValida = () => {
    alert(validaEmailC(new emailValidacaoAdapter(), email!));
  }

  return (
    <main className="flex min-h-screen flex-col items-center justify-between p-24">
      <div className="bg-zinc-500 w-2/4 h-2/4 flex flex-col p-2 justify-center ">
        <form onSubmit={handleValida}>
          <div className='flex flex-col p-2'>
            <label htmlFor="text">Email</label>
            <input className="bg-slate-400 rounded-md" type="email" onChange={(e) => setEmail(e.target.value)} />
          </div>
          <button className='bg-green-800 rounded-lg borders border-zinc-800 m-1 p-2'>Validar email</button>
        </form>
      </div>
    </main>
  )
}
