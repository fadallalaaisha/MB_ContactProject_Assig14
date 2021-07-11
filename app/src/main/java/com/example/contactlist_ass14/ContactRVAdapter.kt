package com.example.contactlist_ass14

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class ContactRVAdapter (var contactList:List<Contacts>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
       var itemView=LayoutInflater.from(parent.context)
           .inflate(R.layout.contactnumber,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContacts=contactList.get(position)
        holder.tvName.text=currentContacts.name
        holder.tvEmail.text=currentContacts.email
        holder.tvPhoneNumber.text=currentContacts.phoneNumber

    }

    override fun getItemCount(): Int {
        return contactList.size

    }
}
class ContactViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
}